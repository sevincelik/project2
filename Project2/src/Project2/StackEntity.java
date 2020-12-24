package Project2;

import java.util.Arrays;

public class StackEntity {
        private static final int CAPACITY = 0;
        private Object elements[];
        private int size = 0;

        public StackEntity() {
            elements = new Object[CAPACITY];
        }

        public void push(String t) {
            if (size == elements.length) {
                increaseSize();
            }
            elements[size++] = t;
        }

        private void increaseSize() {
            int newSize = elements.length + 1;
            elements = Arrays.copyOf(elements, newSize);
        }

        public int length() {
            return elements.length;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < size; i++) {
                sb.append(elements[i].toString());
                if (i < size - 1) {
                    sb.append(",");
                }
            }
            sb.append(']');
            return sb.toString();
        }
}
