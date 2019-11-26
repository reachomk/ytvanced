package defpackage;

import android.support.design.textfield.TextInputEditText;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: yxr */
public final class yxr {
    public final View a;
    public final TextInputEditText b;

    public yxr(yxt yxt, View view) {
        this.a = (View) amqw.a((Object) view);
        this.b = (TextInputEditText) amqw.a((TextInputEditText) view.findViewById(R.id.edit_chat_name_edit_text));
        this.b.setOnClickListener(new yxq(yxt));
    }
}
