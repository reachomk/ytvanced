package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: frh */
final /* synthetic */ class frh implements yty {
    private final frf a;

    frh(frf frf) {
        this.a = frf;
    }

    public final void a(String str, String str2) {
        fjg fjg = this.a.ad;
        amqw.a(TextUtils.isEmpty(str) ^ 1);
        amqw.a(TextUtils.isEmpty(str2) ^ 1);
        Bundle b = fiw.b();
        b.putString("chat_entity_key", str);
        b.putString("chat_message_entity_key", str2);
        fjg.a(new fiw(frn.class, b));
    }
}
