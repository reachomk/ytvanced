package defpackage;

import android.os.Bundle;

/* renamed from: urx */
final class urx implements usa {
    urx() {
    }

    public final nd a() {
        return new uqx();
    }

    public final nd a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        boolean z2 = true;
        boolean z3 = charSequence != null && charSequence.length() > 0;
        amqw.a(z3);
        amqw.a(i > 0);
        z3 = i2 >= 0 && i2 < 13;
        amqw.a(z3);
        z3 = i3 > 0 && i3 <= 31;
        amqw.a(z3);
        if (z && (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0))) {
            z2 = false;
        }
        amqw.a(z2);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("birthday_picker_title", charSequence);
        bundle.putInt("birthday_picker_year", i);
        bundle.putInt("birthday_picker_month", i2);
        bundle.putInt("birthday_picker_day", i3);
        bundle.putBoolean("birthday_picker_hide_year", z);
        uqx uqx = new uqx();
        uqx.f(bundle);
        return uqx;
    }
}
