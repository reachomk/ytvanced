package defpackage;

import android.content.Context;
import android.widget.EditText;
import android.widget.Spinner;

/* renamed from: usc */
public final class usc {
    public final usg a;
    public final EditText b;
    public final Spinner c;
    public String d;

    public usc(Context context, EditText editText, Spinner spinner) {
        amqw.a((Object) context);
        this.b = (EditText) amqw.a((Object) editText);
        this.c = (Spinner) amqw.a((Object) spinner);
        editText.setOnFocusChangeListener(new usb(spinner));
        editText.setOnClickListener(new use(spinner));
        spinner.setOnItemSelectedListener(new usd(this, editText));
        this.a = new usg(context);
        spinner.setAdapter(this.a);
    }
}
