package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: adxj */
final /* synthetic */ class adxj implements OnClickListener {
    private final adxh a;
    private final adis b;

    adxj(adxh adxh, adis adis) {
        this.a = adxh;
        this.b = adis;
    }

    public final void onClick(View view) {
        adxh adxh = this.a;
        adxh.b.a(this.b, new adxo(adxh));
    }
}
