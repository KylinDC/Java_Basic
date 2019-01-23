public class LoopTestDemo {

    public static class EndLoopDemo {
        void breakTest() {
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    break;
                }
                System.out.println(i);
            }
        }

        void continueTest() {
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        EndLoopDemo endLoopDemo = new EndLoopDemo();
        endLoopDemo.breakTest();
        endLoopDemo.continueTest();
    }
}
