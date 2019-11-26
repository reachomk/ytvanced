package defpackage;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gya */
final /* synthetic */ class gya implements OnClickListener {
    private final gyb a;

    gya(gyb gyb) {
        this.a = gyb;
    }

    public final void onClick(View view) {
        gyb gyb = this.a;
        if (((Editable) gyb.ac.getText()).toString().length() != 0) {
            Editable editable = (Editable) gyb.ac.getText();
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.services.flags.user_comments", editable);
            gyb.ah.a(gyb.Z, hashMap);
            gyb.dismiss();
            return;
        }
        if (gyb.ae == null) {
            aeg aeg = new aeg(gyb.p());
            aeg.a.f = gyb.af;
            aeg.a(false);
            aeg.a(R.string.ok, gyc.a);
            gyb.ae = aeg.a();
        }
        gyb.ae.show();
    }
}
