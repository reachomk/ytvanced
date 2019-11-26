package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

/* renamed from: akcr */
public final class akcr extends akcn {
    private final aril a;

    private akcr(aril aril, aaas aaas, Object obj) {
        super(aaas, obj);
        this.a = (aril) amqw.a((Object) aril);
    }

    public static void a(Context context, aril aril, aaas aaas, Object obj) {
        arml arml;
        akcr akcr = new akcr(aril, aaas, obj);
        Builder builder = new Builder(context);
        arml arml2 = null;
        if ((aril.a & 2) != 0) {
            arml = aril.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        builder.setTitle(ajqy.a(arml));
        if ((aril.a & 1) != 0) {
            arml = aril.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        builder.setMessage(aabb.a(arml, aaas, true));
        if ((aril.a & 4) != 0) {
            arml2 = aril.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        builder.setPositiveButton(ajqy.a(arml2), akcr);
        akcr.a(builder.create());
        akcr.d();
        View view = (TextView) akcr.f.findViewById(16908299);
        view.setMovementMethod(LinkMovementMethod.getInstance());
        if (VERSION.SDK_INT < 26) {
            abe.a(view, new xou(view));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        aril aril = this.a;
        int i = aril.a;
        aaas aaas;
        apxu apxu;
        if ((i & 16) != 0) {
            aaas = this.d;
            apxu = aril.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, c());
        } else if ((i & 8) != 0) {
            aaas = this.d;
            apxu = aril.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, c());
        }
    }
}
