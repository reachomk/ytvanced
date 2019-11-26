package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yei */
public final class yei extends Dialog {
    private final aqlv a;
    private final akkl b;

    public yei(Context context, akkl akkl, aqlv aqlv) {
        super(context);
        this.a = (aqlv) amqw.a((Object) aqlv);
        this.b = (akkl) amqw.a((Object) akkl);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        arml arml;
        aygk aygk;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.conversation_invite_confirmation_dialog);
        TextView textView = (TextView) findViewById(R.id.title_text);
        aqlv aqlv = this.a;
        arml arml2 = null;
        if ((aqlv.a & 1) != 0) {
            arml = aqlv.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        akle akle = new akle(this.b, (ImageView) findViewById(R.id.user_thumbnail));
        aqlv aqlv2 = this.a;
        if ((aqlv2.a & 2) != 0) {
            aygk = aqlv2.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        akle.a(aygk);
        textView = (TextView) findViewById(R.id.public_user_name);
        aqlv = this.a;
        if ((aqlv.a & 4) != 0) {
            arml = aqlv.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = (TextView) findViewById(R.id.confirmation_details);
        aqlv = this.a;
        if ((aqlv.a & 8) != 0) {
            arml = aqlv.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        textView = (TextView) findViewById(R.id.confirmation_button);
        aphj aphj = this.a.f;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((aphj.a & 1) != 0) {
            aphj = this.a.f;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 128) == 0) {
                arml = null;
            } else {
                aphj = this.a.f;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            textView.setText(ajqy.a(arml));
        }
        textView.setOnClickListener(new yeh(this));
        textView = (TextView) findViewById(R.id.cancel_button);
        aphj = this.a.g;
        if (aphj == null) {
            aphj = aphj.d;
        }
        if ((1 & aphj.a) != 0) {
            aphj aphj2 = this.a.g;
            if (aphj2 == null) {
                aphj2 = aphj.d;
            }
            aphg aphg2 = aphj2.b;
            if (aphg2 == null) {
                aphg2 = aphg.s;
            }
            textView.setVisibility(0);
            if ((aphg2.a & 128) != 0) {
                arml2 = aphg2.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            textView.setText(ajqy.a(arml2));
            textView.setOnClickListener(new yek(this));
            return;
        }
        textView.setVisibility(8);
    }
}
