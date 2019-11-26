package defpackage;

import android.content.Intent;

/* renamed from: bpx */
public final class bpx extends bqn {
    public Intent a;

    public bpx(Intent intent) {
        this.a = intent;
    }

    public bpx(bqd bqd) {
        super(bqd);
    }

    public bpx(String str) {
        super(str);
    }

    public bpx(String str, Exception exception) {
        super(str, exception);
    }

    public final String getMessage() {
        if (this.a != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }
}
