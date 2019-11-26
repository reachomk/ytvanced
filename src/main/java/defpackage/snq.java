package defpackage;

import android.view.View;
import android.widget.EditText;

/* renamed from: snq */
public final class snq {
    public static swg a(View view) {
        skk a = skh.g().a(view);
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            azsj azsj = (azsj) azsg.c.createBuilder();
            azsj.a(editText.getText().toString());
            azue azue = (azue) azuf.e.createBuilder();
            azue.a((azsg) ((anxl) azsj.build()));
            azue.a(view.isFocused());
            azue.a(editText.getSelectionEnd());
            azvk azvk = (azvk) azvl.a.createBuilder();
            azvk.a(azuf.f, (azuf) ((anxl) azue.build()));
            a.a((azvl) ((anxl) azvk.build()));
        }
        return a.a();
    }
}
