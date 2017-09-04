package basicDemo.v2;

import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class BasicDemo {

    public static void main(String[] args) {
        Observable observable = Observable.just("Hello", "Hi", "Aloha");

        Consumer<String> onNextAction = (o)-> System.out.println(o);
        Action onCompletedAction  = ()-> System.out.println("completed!");
        Consumer<Throwable> onErrorAction  = (e)-> System.out.println("Error！");

        observable.subscribe(onNextAction, onErrorAction, onCompletedAction);
    }

}
