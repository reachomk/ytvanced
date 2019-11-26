package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: azf */
public class azf extends afe {
    private final bbb a;
    private final azh b;
    private TextView c;
    private baz d;
    private ArrayList e;
    private azg f;
    private ListView g;
    private boolean h;
    private long i;
    private final Handler j;

    public azf(Context context) {
        this(context, (byte) 0);
    }

    public azf(Context context, byte b) {
        context = bai.a(context, 0, false);
        super(context, bai.a(context));
        this.d = baz.c;
        this.j = new aze(this);
        this.a = bbb.a(getContext());
        this.b = new azh(this);
    }

    public final void a(baz baz) {
        if (baz == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.d.equals(baz)) {
            this.d = baz;
            if (this.h) {
                this.a.a(this.b);
                this.a.a(baz, this.b, 1);
            }
            c();
        }
    }

    public void a(List list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size > 0) {
                if (!a((bbs) list.get(i))) {
                    list.remove(i);
                }
                size = i;
            } else {
                return;
            }
        }
    }

    public final boolean a(bbs bbs) {
        return !bbs.c() && bbs.g && bbs.a(this.d);
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setTitle(int i) {
        this.c.setText(i);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.mr_chooser_dialog);
        this.e = new ArrayList();
        this.f = new azg(this, getContext(), this.e);
        this.g = (ListView) findViewById(R.id.mr_chooser_list);
        this.g.setAdapter(this.f);
        this.g.setOnItemClickListener(this.f);
        this.g.setEmptyView(findViewById(16908292));
        this.c = (TextView) findViewById(R.id.mr_chooser_title);
        b();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        getWindow().setLayout(bag.a(getContext()), -2);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = true;
        this.a.a(this.d, this.b, 1);
        c();
    }

    public final void onDetachedFromWindow() {
        this.h = false;
        this.a.a(this.b);
        this.j.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public final void c() {
        if (this.h) {
            List arrayList = new ArrayList(bbb.a());
            a(arrayList);
            Collections.sort(arrayList, azj.a);
            if (SystemClock.uptimeMillis() - this.i >= 300) {
                b(arrayList);
                return;
            }
            this.j.removeMessages(1);
            Handler handler = this.j;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.i + 300);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(List list) {
        this.i = SystemClock.uptimeMillis();
        this.e.clear();
        this.e.addAll(list);
        this.f.notifyDataSetChanged();
    }
}
