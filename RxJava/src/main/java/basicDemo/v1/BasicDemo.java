package basicDemo.v1;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class BasicDemo {

    public static void main(String[] args) {
        // 观察者
        Observer<String> observer = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String value) {
                System.out.println("Item: " + value);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("Error!");
            }

            @Override
            public void onComplete() {
                System.out.println("Completed!");
            }
        };

        // 被观察者
        Observable observable = Observable.create((e)-> {  // e->事件
            e.onNext("Hello");
            e.onNext("Hi");
            e.onComplete();
        });

        // 订阅
        observable.subscribe(observer);
    }

}
