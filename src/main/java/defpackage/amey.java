package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: amey */
public class amey extends FilterInputStream {
    private final boolean a;
    private final long b;

    public amey(InputStream inputStream) {
        super(inputStream);
        this.a = false;
        this.b = -1;
    }

    public amey(InputStream inputStream, long j) {
        super(inputStream);
        amqw.a(j >= 0);
        this.a = true;
        this.b = j;
    }

    public boolean a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }
}
