package defpackage;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: acqr */
public final class acqr extends nf {
    private CountDownTimer Z;
    public acqw a;
    public long b;
    private areg c;

    public final void e(Bundle bundle) {
        bundle.putLong("SAVED_CONTRACT_TIME_REMAINING_MILLIS", this.b);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((acqt) xse.a(this.y)).a(this);
        try {
            this.c = (areg) anxl.parseFrom(areg.c, this.j.getByteArray("ARG_SUPER_CHAT_SUCCESS_RENDERER"), anxa.c());
            if (bundle != null) {
                this.b = bundle.getLong("SAVED_CONTRACT_TIME_REMAINING_MILLIS");
            }
        } catch (anyg e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 42);
            stringBuilder.append("Failed to parse SuperChatSuccessRenderer: ");
            stringBuilder.append(valueOf);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.c == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.verification_result_success_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        arml arml = this.c.b;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        return inflate;
    }

    public final void B() {
        super.B();
        long j = this.b;
        if (j <= 0) {
            j = 3000;
        }
        this.Z = new acqu(this, j);
        this.Z.start();
    }
}
