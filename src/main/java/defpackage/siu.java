package defpackage;

import android.text.TextUtils;
import java.util.List;

/* renamed from: siu */
public final class siu implements sis {
    private final tmn a;
    private final List b;

    public siu(tmp tmp, String str) {
        tmm a = tmp.a("com.google.oauthintegrations.ExperimentFlags");
        a.a("enable_test_feature");
        this.a = a.a("enable_big_blue_button_flow");
        tmn a2 = a.a("whitelisted_service_ids_for_google_material", "");
        if (TextUtils.isEmpty((CharSequence) a2.a())) {
            this.b = amul.g();
        } else {
            this.b = amqz.a(",").a().b().c((CharSequence) a2.a());
        }
    }

    public final Boolean a() {
        return (Boolean) this.a.a();
    }

    public final List b() {
        return this.b;
    }
}
