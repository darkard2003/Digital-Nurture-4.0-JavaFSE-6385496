package org.example;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;

public class ApiServiceTest {
    private ApiService apiService;

    @BeforeEach
    public void setUp() {
        RestClass mockRestClass = mock(RestClass.class);
        when(mockRestClass.getData()).
                thenReturn("Mocked Data");
        when(mockRestClass.postData("Test Data")).
                thenReturn("Received data: Test Data");
        when(mockRestClass.putData("Updated Data")).
                thenReturn("Updated data to: Updated Data");
        when(mockRestClass.deleteData("Deleted Data")).
                thenReturn("Deleted data: Deleted Data");
        apiService = new ApiService(mockRestClass);
    }

    @AfterEach
    public void tearDown() {
        apiService = null;
    }

    @Test
    @DisplayName("Test fetchData method")
    public void testFetchData() {
        String result = apiService.fetchData();
        Assertions.assertEquals("Mocked Data", result);
    }

    @Test
    @DisplayName("Test updateData method")
    public void testSendData() {
        String result = apiService.sendData("Test Data");
        Assertions.assertEquals("Received data: Test Data", result);
    }

    @Test
    @DisplayName("Test updateData method")
    public void testUpdateData() {
        String result = apiService.updateData("Updated Data");
        Assertions.assertEquals("Updated data to: Updated Data", result);
    }

    @Test
    @DisplayName("Test removeData method")
    public void testRemoveData() {
        String result = apiService.removeData("Deleted Data");
        Assertions.assertEquals("Deleted data: Deleted Data", result);
    }

}
