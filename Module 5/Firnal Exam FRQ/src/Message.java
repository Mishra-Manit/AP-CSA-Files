
public class Message{

    private int idLength;
    private String deviceID;
    private int msgLength;
    private String textMsg = "08 abc1233y 16 Computer Science ";

    public Message(String msg){
        //implementation not shown
    }

    public boolean isValid() {
        int indexOfFirstSpace = textMsg.indexOf(" ");
        String id = textMsg.substring(0, indexOfFirstSpace);
        idLength = Integer.parseInt(id);

        int indexOfSecondSpace = textMsg.indexOf(" ", indexOfFirstSpace + 1);
        String textMsgDeviceID = textMsg.substring(indexOfFirstSpace + 1, indexOfSecondSpace);
        int deviceIDLength = textMsgDeviceID.length();

        deviceID = textMsgDeviceID;

        int indexOfThirdSpace = textMsg.indexOf(" ", indexOfSecondSpace + 1);
        String stringSupposedTextMsgLength = textMsg.substring(indexOfSecondSpace + 1, indexOfThirdSpace);
        int supposedTextMsgLength = Integer.parseInt(stringSupposedTextMsgLength);

        String textMessageSent = textMsg.substring(indexOfThirdSpace + 1);
        int actualTextMessageLength = textMessageSent.length();

        msgLength = actualTextMessageLength;

        boolean isValid;

        if (idLength == deviceIDLength && msgLength == supposedTextMsgLength) {
            isValid = true;
        } else {
            isValid = false;
        }


        System.out.println(isValid);

        return isValid;
    }

    public int wordCount(){
        int wordCount = 0;

        int indexOfFirstSpace = textMsg.indexOf(" ");
        int indexOfSecondSpace = textMsg.indexOf(" ", indexOfFirstSpace + 1);
        int indexOfThirdSpace = textMsg.indexOf(" ", indexOfSecondSpace + 1);

        String actualTextMessage = textMsg.substring(indexOfThirdSpace + 1);

        int i;
        int start = 0;

        while ((i = actualTextMessage.indexOf(" ", start)) != -1) //find index of blank spaces
        {
            String tempWord = actualTextMessage.substring(start, i); //finding the words which is not a space
            if (!(tempWord.equalsIgnoreCase("")))
            {
                wordCount ++;
            }

            start = i + 1; //set index after the space

        }


        String tempWord = actualTextMessage.substring(start); //getting the last word
        if (!(tempWord.equalsIgnoreCase(""))) //Make sure it is not space
        {
            wordCount = wordCount + 1;
        }

        System.out.println("Word Count: " + wordCount);

        return wordCount;
    }

}