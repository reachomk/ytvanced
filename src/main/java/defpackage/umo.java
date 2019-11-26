package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: umo */
public abstract class umo extends RelativeLayout implements OnSeekBarChangeListener, nlu, ujk {
    public final Runnable a = new umn(this);
    public TextView b;
    public TextView c;
    public SeekBar d;
    public nlp e;
    public final Set f = EnumSet.noneOf(ujh.class);
    public boolean g = false;
    private int h = -1;
    private int i = -1;
    private ujf j;
    private final List k = new CopyOnWriteArrayList();

    public umo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
    }

    public final void a(nlq nlq) {
    }

    public void a(ujf ujf, Set set) {
        throw null;
    }

    public void b(ujf ujf, Set set) {
        throw null;
    }

    public abstract void e();

    public final void a(nlp nlp) {
        nlp nlp2 = this.e;
        if (nlp2 != null) {
            nlp2.b((nlu) this);
        }
        this.e = nlp;
        nlp = this.e;
        if (nlp != null) {
            nlp.a((nlu) this);
        }
        e();
        c();
    }

    public final void a(ujf ujf) {
        ujf ujf2 = this.j;
        if (ujf2 != null) {
            ujf2.b((ujk) this);
        }
        this.j = ujf;
        ujf = this.j;
        if (ujf != null) {
            ujf.a((ujk) this);
        }
        g();
        h();
    }

    public final void b() {
        nlp nlp = this.e;
        if (nlp != null) {
            boolean d = nlp.d();
            if (!d && this.e.i() >= f()) {
                a(i());
            }
            this.e.a(d ^ 1);
        }
    }

    public final void a(unj unj) {
        this.k.add(unj);
    }

    public final void b(unj unj) {
        this.k.remove(unj);
    }

    public final void c() {
        for (unj a_ : this.k) {
            a_.a_(d());
        }
    }

    public final boolean d() {
        nlp nlp = this.e;
        return nlp != null && nlp.d();
    }

    public final void a(boolean z, int i) {
        post(new umq(this));
    }

    public final void a(ujf ujf, ujh ujh) {
        if (this.e != null) {
            if (ujh == ujh.TrimStart) {
                a(ujf.j());
            } else if (ujh == ujh.TrimEnd && !this.f.contains(ujh.TrimStart)) {
                a(ujf.l());
            }
            g();
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            a(i() + (((long) i) * 1000));
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.e != null) {
            this.g = d();
            this.e.a(false);
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        nlp nlp = this.e;
        if (nlp != null) {
            nlp.a(this.g);
        }
    }

    public final void a(long j) {
        nlp nlp = this.e;
        if (nlp != null) {
            double d = (double) j;
            Double.isNaN(d);
            nlp.a((long) Math.ceil(d / 1000.0d));
        }
    }

    private final long i() {
        ujf ujf = this.j;
        return ujf != null ? ujf.j() : 0;
    }

    private final long j() {
        ujf ujf = this.j;
        return ujf != null ? ujf.k() : 0;
    }

    public final long f() {
        ujf ujf = this.j;
        if (ujf != null) {
            return ujf.m();
        }
        nlp nlp = this.e;
        if (nlp == null) {
            return 0;
        }
        return nlp.h();
    }

    public final void g() {
        if (this.e != null) {
            long f = f() - j();
            if (this.f.isEmpty()) {
                this.d.setMax((int) f);
            }
            int i = (int) (f / 1000);
            if (i != this.i) {
                this.i = i;
                this.c.setText(uix.a(getContext(), (long) (this.i * 1000), false));
                this.c.setContentDescription(uix.a(getContext(), (int) R.string.edited_video_duration_content_description, (long) (this.i * 1000)));
            }
        }
    }

    public final void h() {
        nlp nlp = this.e;
        if (nlp != null) {
            long i = nlp.i() - j();
            if (this.f.isEmpty()) {
                this.d.setProgress((int) i);
            } else {
                i = 0;
            }
            int i2 = (int) (i / 1000);
            if (i2 != this.h) {
                this.h = i2;
                this.b.setText(uix.a(getContext(), (long) (this.h * 1000), false));
                this.b.setContentDescription(uix.a(getContext(), (int) R.string.current_playback_time_content_description, (long) (this.h * 1000)));
            }
        }
    }
}
