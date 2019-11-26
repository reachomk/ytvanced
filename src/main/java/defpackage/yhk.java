package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yhk */
public final class yhk extends allk implements alhm {
    public final Context a;
    public int b;
    private final yhj g = new yhj(this);
    private final akmx h;

    public yhk(Context context, akkq akkq, aaas aaas, akmx akmx, akvp akvp) {
        super(context, aaas, akmx, akkq, akvp);
        this.a = (Context) amqw.a((Object) context);
        this.h = (akmx) amqw.a((Object) akmx);
    }

    public final void d() {
    }

    public final void e() {
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return this.c.a(arwh.ADD_FRIEND);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(Resources resources) {
        return resources.getString(R.string.conversation_accessibility_invite_contact);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(alkz alkz, aaas aaas) {
        int i = this.b;
        if (i != 2 && i != 4) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.g);
            apxu apxu = alkz.d().l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(alkz alkz) {
        super.a(alkz);
        this.d.setText(alkz.e());
        if (alkz.d() != null) {
            if (alkz.f) {
                a(2);
            } else {
                a(1);
            }
        } else if (alkz.f) {
            a(4);
        } else {
            a(3);
        }
    }

    public final void a(boolean z, boolean z2) {
        aqil aqil = (aqil) this.f;
        Uri a = alle.a((aqil.a & 4096) != 0 ? aqil.k : null);
        alkz alkz = (alkz) this.h.a(a);
        akmx akmx = this.h;
        alky a2 = alkz.a();
        a2.a = z;
        a2.b = z2;
        akmx.b(a, a2.a());
    }

    private final void a(int i) {
        xak.a();
        if (this.b != i) {
            this.b = i;
            i--;
            if (i == 1 || i == 2) {
                b(false);
                a(true);
            } else {
                b(true);
                a(false);
            }
        }
    }
}
