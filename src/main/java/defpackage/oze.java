package defpackage;

import java.io.IOException;

/* renamed from: oze */
public final class oze extends IOException {
    public oze(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder(60);
        stringBuilder.append("Priority too low [priority=");
        stringBuilder.append(i);
        stringBuilder.append(", highest=");
        stringBuilder.append(i2);
        stringBuilder.append("]");
        super(stringBuilder.toString());
    }
}
