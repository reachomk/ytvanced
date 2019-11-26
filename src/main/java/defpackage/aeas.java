package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aeas */
public final class aeas {
    public static final String a = xtl.b("MDX.WaitingController");
    public final aeat b;
    public final Context c;
    public final acvx d;
    public final Runnable e;
    public final Handler f;
    public final AtomicInteger g = new AtomicInteger(0);

    public aeas(View view, aeat aeat, acvx acvx) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = view.getContext();
        this.b = aeat;
        this.d = acvx;
        this.f = handler;
        acvx.a(acwl.H, null, null);
        view.findViewById(R.id.cancel_button).setOnClickListener(new aear(aeat));
        this.e = new aeau(this, aeat);
    }
}
