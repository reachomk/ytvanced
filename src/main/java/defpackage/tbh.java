package defpackage;

import android.content.Intent;

/* renamed from: tbh */
public class tbh extends tbd {
    private final Intent a;

    public tbh(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public tbh(String str, Intent intent, Exception exception) {
        super(str, exception);
        this.a = intent;
    }

    public final Intent a() {
        Intent intent = this.a;
        return intent != null ? new Intent(intent) : null;
    }
}
