 public class Message {
         String text;

        public void setText(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public String toString() {
            return "Text: " + text;
        }
    }

    class SMS extends Message {
        private String recipientContactNo;

        public void setRecipientContactNo(String recipientContactNo) {
            this.recipientContactNo = recipientContactNo;
        }

        public String getRecipientContactNo() {
            return recipientContactNo;
        }

        @Override
        public String toString() {
            return "Recipient Contact No: " + recipientContactNo + ", Text: " + text;
        }
    }

    class Email extends Message {
        private String receiver;
        private String sender;
        private String subject;

        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public String getReceiver() {
            return receiver;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getSender() {
            return sender;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }

        @Override
        public String toString() {
            return "Sender: " + sender + ", Receiver: " + receiver + ", Subject: " + subject + ", Text: " + text;
        }
    }

    class darshan {
        public static void main(String[] args) {
            SMS sms = new SMS();
            Email email = new Email();

            sms.setRecipientContactNo("03047659087");
            sms.setText("Hello Rashid");

            email.setReceiver("someone@lakhwani.com");
            email.setSender("dklakhwani.com");
            email.setSubject("Namste");
            email.setText("Hi Saif");

            System.out.println("SMS Details:");
            System.out.println(sms.toString());

            System.out.println("\nEmail Details:");
            System.out.println(email.toString());
        }
    }
