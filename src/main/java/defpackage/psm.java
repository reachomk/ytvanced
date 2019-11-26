package defpackage;

import android.content.Intent;

/* renamed from: psm */
public class psm extends Exception {
    private final Intent a;

    public psm(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public final Intent a() {
        return new Intent(this.a);
    }
}
