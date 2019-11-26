package defpackage;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: ypr */
public final class ypr extends yrc {
    public String c;
    private final aaas e;

    public ypr(ywk ywk, akkq akkq, yil yil, ymx ymx, aaas aaas, Handler handler) {
        super(ywk, akkq, ymx, handler);
        this.e = (aaas) amqw.a((Object) aaas);
    }

    public final int a(int i) {
        return i < a() + -1 ? 1 : 2;
    }

    public final int a() {
        return super.a() + 1;
    }

    public final aqj a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return super.a(viewGroup, i);
        }
        if (i == 2) {
            return new ypu(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.add_participants_button, viewGroup, false), this.c, this.e);
        }
        StringBuilder stringBuilder = new StringBuilder(39);
        stringBuilder.append(i);
        stringBuilder.append(" view type is not supported!");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public final void a(aqj aqj, int i) {
        if (a(i) == 1) {
            super.a(aqj, i);
        }
    }
}
