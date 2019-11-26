package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;

/* renamed from: ion */
public final /* synthetic */ class ion implements OnClickListener {
    private final NavigationDropdownView a;

    public ion(NavigationDropdownView navigationDropdownView) {
        this.a = navigationDropdownView;
    }

    public final void onClick(View view) {
        NavigationDropdownView navigationDropdownView = this.a;
        int d = ((ioq) view.getTag()).d();
        navigationDropdownView.b(true);
        ior ior = navigationDropdownView.h;
        boolean z = d >= 0 && d < ior.c.size();
        amqw.a(z);
        aqyj aqyj = (aqyj) ior.c.get(d);
        if (!amqq.a(navigationDropdownView.e, aqyj)) {
            aqyj aqyj2 = navigationDropdownView.e;
            if (aqyj2 != null) {
                aqyi aqyi = (aqyi) ((anxo) aqyj2.toBuilder());
                aqyi.a(false);
                navigationDropdownView.e = (aqyj) ((anxl) aqyi.build());
            }
            navigationDropdownView.e = aqyj;
            aqyj = navigationDropdownView.e;
            if (aqyj != null) {
                arml arml;
                aqyi aqyi2 = (aqyi) ((anxo) aqyj.toBuilder());
                aqyi2.a(true);
                navigationDropdownView.e = (aqyj) ((anxl) aqyi2.build());
                TextView textView = navigationDropdownView.a;
                aqyj2 = navigationDropdownView.e;
                if ((1 & aqyj2.a) != 0) {
                    arml = aqyj2.d;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                textView.setText(ajqy.a(arml));
                iot iot = navigationDropdownView.d;
                if (iot != null) {
                    iot.a(navigationDropdownView.e);
                }
            }
        }
    }
}
