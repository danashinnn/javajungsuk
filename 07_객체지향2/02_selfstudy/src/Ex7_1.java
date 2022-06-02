class Tv {
    boolean power; //전원상태 on/off
    int channel; //채널

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class SmartTv extends Tv { //SmartTv는 Tv에 캡션을 보여주는 기능을 가짐
    boolean caption; //캡션상태 on/off
    void displayCaption(String text) {
        if(caption) { //캡션상태가 on(true)일 때만 text를 보여줌
            System.out.println(text);
        }
    }
}

class Ex7_1 {
    public static void main(String[] args) {
        SmartTv st = new SmartTv();
        st.channel = 10;
        st.channelUp();
        System.out.println(st.channel);
        st.displayCaption("Hello, World!");
        st.caption = true;
        st.displayCaption("Hello, World!");
    }
}