package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: bkq */
public final class bkq extends Paint {
    public final void setTextLocales(LocaleList localeList) {
    }

    public bkq(int i) {
        super(i);
    }

    public bkq(Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public bkq(Mode mode, byte b) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
