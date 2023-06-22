package behavioral.chain.simple2;

public class InterceptingFilterDemo {

    /*Шаблон проектирования перехватывающего фильтра используется, когда мы хотим
    выполнить некоторую предварительную/постобработку с запросом или ответом приложения.
    Фильтры определяются и применяются к запросу перед передачей запроса
    фактическому целевому приложению. Фильтры могут выполнять
    аутентификацию/авторизацию/регистрацию или отслеживание запросов,
    а затем передавать запросы соответствующим обработчикам.*/
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}