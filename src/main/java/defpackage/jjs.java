package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: jjs */
public final class jjs extends egj implements egm, exw {
    public jjs(nn nnVar, exu exu) {
        super(nnVar, exu, "MultiPageMenuDialogFragmentController");
    }

    public final void a(akbb akbb) {
        super.f();
        if (e() == null) {
            jjo jjo = new jjo();
            Bundle bundle = new Bundle();
            bundle.putByteArray("MenuButtonRendererKey", aocf.toByteArray(akbb));
            jjo.f(bundle);
            jjo.w();
            amqw.b(true);
            a(jjo);
        }
    }

    public final void a(Configuration configuration) {
        nd e = e();
        if (e != null && e.v()) {
            e.onConfigurationChanged(configuration);
        }
    }
}
