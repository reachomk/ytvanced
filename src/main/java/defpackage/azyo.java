package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

/* renamed from: azyo */
public final class azyo implements azyk {
    private azyq a;
    private final int b;
    private final int c;

    private azyo(azyq azyq) {
        this.a = azyq;
        this.b = 300000;
        this.c = 300000;
    }

    public azyo(azyq azyq, byte b) {
        this(azyq);
    }

    public azyo() {
        this(new azyt());
    }

    public final azzh a(String str, String str2, azyn azyn, azyl azyl) {
        try {
            HttpURLConnection a = this.a.a(str);
            int i = this.b;
            int i2 = this.c;
            azyr azyr = new azyr();
            return new azys(a, str2, azyn, azyl, i, i2);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }
}
