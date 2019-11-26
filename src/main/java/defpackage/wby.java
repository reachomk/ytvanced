package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wby */
public final class wby {
    public final View a;
    public final wcc b;
    public final OnTouchListener c;
    public final List d = new ArrayList();
    public MotionEvent e;
    public boolean f;

    public wby(View view, wcc wcc, OnTouchListener onTouchListener) {
        this.a = (View) amqw.a((Object) view);
        this.b = (wcc) amqw.a((Object) wcc);
        this.c = onTouchListener;
        this.a.setOnTouchListener(new wcb(this));
        this.a.setOnClickListener(new wca(this));
    }

    public final void a(View view) {
        view.setOnTouchListener(new wcd(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        super.finalize();
        b();
    }

    public final void a() {
        if (this.f) {
            this.f = false;
            this.d.clear();
            b();
        }
    }

    public final void b() {
        MotionEvent motionEvent = this.e;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.e = null;
    }
}
