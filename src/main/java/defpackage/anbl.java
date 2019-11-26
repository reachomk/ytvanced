package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: anbl */
final class anbl extends anax {
    private final File a;
    private final amuw b;

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 20) + valueOf2.length());
        stringBuilder.append("Files.asByteSink(");
        stringBuilder.append(valueOf);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final /* synthetic */ OutputStream a() {
        return new FileOutputStream(this.a, this.b.contains(anbh.a));
    }

    /* synthetic */ anbl(File file, anbh[] anbhArr) {
        this.a = (File) amqw.a((Object) file);
        this.b = amuw.a((Object[]) anbhArr);
    }
}
