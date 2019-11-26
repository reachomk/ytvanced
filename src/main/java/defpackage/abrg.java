package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: abrg */
final class abrg implements TextWatcher {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final /* synthetic */ EditText b;
    private final /* synthetic */ abrf c;

    abrg(abrf abrf, EditText editText) {
        this.c = abrf;
        this.b = editText;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.c.f && i2 > 0) {
            i2 += i;
            Editable editableText = this.b.getEditableText();
            for (Object obj : (ImageSpan[]) editableText.getSpans(i, i2, ImageSpan.class)) {
                int spanStart = editableText.getSpanStart(obj);
                int spanEnd = editableText.getSpanEnd(obj);
                if (spanStart < i2 && spanEnd > i) {
                    this.a.add(obj);
                }
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        abrf abrf = this.c;
        if (!abrf.f) {
            abrf.f = true;
            editable = this.b.getEditableText();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ImageSpan imageSpan = (ImageSpan) it.next();
                int spanStart = editable.getSpanStart(imageSpan);
                int spanEnd = editable.getSpanEnd(imageSpan);
                editable.removeSpan(imageSpan);
                if (spanStart != spanEnd) {
                    editable.delete(spanStart, spanEnd);
                }
            }
            this.a.clear();
            abrf abrf2 = this.c;
            Pattern b = abrf2.b.b();
            if (b != null && !TextUtils.isEmpty(editable.toString())) {
                Matcher matcher = b.matcher(editable.toString());
                ArrayList arrayList = new ArrayList();
                while (matcher.find()) {
                    if (((ImageSpan[]) editable.getSpans(matcher.start(), matcher.end(), ImageSpan.class)).length == 0) {
                        if (arrayList.contains(Integer.valueOf(matcher.start()))) {
                            break;
                        }
                        arrayList.add(Integer.valueOf(matcher.start()));
                        editable.replace(matcher.start(), matcher.end(), "");
                        abrf2.a(abrf2.b.b(matcher.group()));
                    }
                }
            }
            this.c.f = false;
        }
    }
}
