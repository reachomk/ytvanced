package defpackage;

import android.content.Intent;

/* renamed from: pil */
public class pil extends pii {
    private final Intent a;

    public pil(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public final Intent a() {
        Intent intent = this.a;
        return intent != null ? new Intent(intent) : null;
    }
}
