/**
 * Created by zangyaoyi on 2017/4/11.
 */
public class TestRun {
    public static void main(String[] args) {


    }

    static class Cat implements Action {
        @Override
        public String cry(String s) {
            return s;
        }

        @Override
        public void running() {

        }
    }

    static class Mouse implements Action {
        @Override
        public String cry(String s) {
            return s;
        }

        @Override
        public void running() {

        }
    }

    interface Action {
        String cry(String s);

        void running();
    }
}
