package defpackage;

import java.io.IOException;

/* renamed from: barm */
public final class barm extends IOException {
    public static final long serialVersionUID = 1;
    public final String a;
    public final int b;

    public barm(int i, String str) {
        String str2;
        switch (i) {
            case 1002:
                str2 = "ProtocolError";
                break;
            case 1003:
                str2 = "UnsupportedData";
                break;
            case 1005:
                str2 = "NoStatusRcvd";
                break;
            case 1006:
                str2 = "AbnormalClosure";
                break;
            case 1007:
                str2 = "InvalidFramePayloadData";
                break;
            case 1008:
                str2 = "PolicyViolation";
                break;
            case 1009:
                str2 = "MessageTooBig";
                break;
            default:
                str2 = "null";
                break;
        }
        StringBuilder stringBuilder = new StringBuilder((str2.length() + 2) + String.valueOf(str).length());
        stringBuilder.append(str2);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        super(stringBuilder.toString(), null);
        this.b = i;
        this.a = str;
    }
}
