package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: psx */
public class psx extends Exception {
    public psx(Status status) {
        int i = status.f;
        String str = status.g;
        if (str == null) {
            str = "";
        }
        StringBuilder stringBuilder = new StringBuilder(str.length() + 13);
        stringBuilder.append(i);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        super(stringBuilder.toString());
    }
}
