package org.example;

import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;

public class ServiceTest {
    private Service service;

    @BeforeEach
    public void setUp() {
        Repository repo = mock(Repository.class);
        when(repo.getData()).thenReturn("Mocked Data");
        service = new Service(repo);
    }

    @AfterEach
    public void tearDown() {
        service = null;
    }

    @Test
    @DisplayName("Test processData with mocked Repository")
    public void testProcessData() {
        String result = service.processData();
        Assertions.assertEquals("Processed: Mocked Data", result);
    }
}
