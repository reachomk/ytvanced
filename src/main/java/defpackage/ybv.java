package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.textfield.TextInputEditText;
import android.support.design.textfield.TextInputLayout;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EditConversationNameEndpointOuterClass$EditConversationNameEndpoint;

/* renamed from: ybv */
public final class ybv extends nd implements OnEditorActionListener {
    public aaas Z;
    public xyl aa;
    public TextInputEditText ab;
    private arao ac;

    public static ybv a(arao arao) {
        amqw.a((Object) arao);
        ybv ybv = new ybv();
        Bundle bundle = new Bundle();
        bundle.putByteArray("edit_chat_name_renderer", arao.toByteArray());
        ybv.f(bundle);
        return ybv;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((yca) xse.a(p())).a(this);
        bundle = this.j;
        if (bundle != null) {
            arao arao;
            try {
                arao = (arao) ((anxl) ((aran) ((anvi) ((aran) arao.g.createBuilder()).mergeFrom(bundle.getByteArray("edit_chat_name_renderer"), anxa.c()))).build());
            } catch (anyg unused) {
                arao = null;
            }
            this.ac = arao;
        }
    }

    public final Dialog a(Bundle bundle) {
        arao arao;
        arml arml;
        aeg aeg = new aeg(M_(), R.style.ConversationPageEditTextDialog);
        arml arml2 = null;
        View inflate = p().getLayoutInflater().inflate(R.layout.edit_conversation_name_conversation_page_frame, null, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.edit_conversation_name_text_input_layout);
        this.ab = (TextInputEditText) inflate.findViewById(R.id.edit_conversation_name_edit_text);
        anxp anxp = this.ac.f;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(EditConversationNameEndpointOuterClass$EditConversationNameEndpoint.editConversationNameEndpoint);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp = this.ac.f;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$0002 = anxl.checkIsLite(EditConversationNameEndpointOuterClass$EditConversationNameEndpoint.editConversationNameEndpoint);
            anxp.a(access$0002);
            Object b = anxp.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            if (((EditConversationNameEndpointOuterClass$EditConversationNameEndpoint) b).d > 0) {
                this.ab.setFilters(new InputFilter[]{new LengthFilter(((int) (r6 / 4)) - 1)});
            }
        }
        aeg.a(inflate);
        if ((this.ac.a & 2) != 0 && textInputLayout.b() == null) {
            arao = this.ac;
            if ((arao.a & 2) != 0) {
                arml = arao.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textInputLayout.a(ajqy.a(arml));
        }
        arao = this.ac;
        if ((arao.a & 1) != 0) {
            TextInputEditText textInputEditText = this.ab;
            arml = arao.b;
            if (arml == null) {
                arml = arml.f;
            }
            textInputEditText.setText(ajqy.a(arml));
        }
        this.ab.setOnEditorActionListener(this);
        if (this.aa == null) {
            aaas aaas = this.Z;
            apxu apxu = this.ac.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            this.aa = new xyl(aaas, apxu);
        }
        arao = this.ac;
        if ((arao.a & 4) != 0) {
            arml = arao.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        ybx ybx = new ybx(this);
        aeb aeb = aeg.a;
        aeb.g = a;
        aeb.h = ybx;
        arao = this.ac;
        if ((arao.a & 8) != 0) {
            arml2 = arao.e;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        a = ajqy.a(arml2);
        yby yby = new yby(this);
        aeb aeb2 = aeg.a;
        aeb2.i = a;
        aeb2.j = yby;
        aeh a2 = aeg.a();
        a2.getWindow().setSoftInputMode(4);
        return a2;
    }

    public final void W_() {
        super.W_();
        xpr.b(this.ab);
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        xpr.a((View) textView);
        return true;
    }
}
