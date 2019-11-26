package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: wym */
public final class wym extends FilterOutputStream {
    private final /* synthetic */ wyn a;

    public final void write(int i) {
        try {
            this.out.write(i);
        } catch (IOException unused) {
            this.a.b = true;
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.a.b = true;
        }
    }

    public final void close() {
        try {
            this.out.close();
        } catch (IOException unused) {
            this.a.b = true;
        }
    }

    public final void flush() {
        try {
            this.out.flush();
        } catch (IOException unused) {
            this.a.b = true;
        }
    }

    public /* synthetic */ wym(wyn wyn, OutputStream outputStream) {
        this.a = wyn;
        super(outputStream);
    }
}
