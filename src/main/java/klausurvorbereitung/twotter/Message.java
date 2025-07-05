package klausurvorbereitung.twotter;

import java.io.Serializable;
import java.time.LocalDate;

public class Message implements Serializable {
        private final String text;
        private final String creationDate;

        public Message(String text) {
            this.text = text;
            this.creationDate = LocalDate.now().toString();
        }

        public String getText() {
            return text;
        }

        public String getCreationDate() {
            return creationDate;
        }

        @Override
        public String toString() {
            return text;
        }
    }

