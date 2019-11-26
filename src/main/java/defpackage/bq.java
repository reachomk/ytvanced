package defpackage;

import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.AttributedCharacterIterator.Attribute;
import java.text.Format;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bq */
final class bq {
    public final Appendable a;
    public int b;
    public List c = null;

    public bq(StringBuilder stringBuilder) {
        this.a = stringBuilder;
        this.b = stringBuilder.length();
    }

    public bq(StringBuffer stringBuffer) {
        this.a = stringBuffer;
        this.b = stringBuffer.length();
    }

    public final void a(CharSequence charSequence) {
        try {
            this.a.append(charSequence);
            this.b += charSequence.length();
        } catch (IOException e) {
            throw new cp(e);
        }
    }

    public final void a(Format format, Object obj) {
        if (this.c == null) {
            a(format.format(obj));
            return;
        }
        AttributedCharacterIterator formatToCharacterIterator = format.formatToCharacterIterator(obj);
        int i = this.b;
        Appendable appendable = this.a;
        try {
            int beginIndex = formatToCharacterIterator.getBeginIndex();
            int endIndex = formatToCharacterIterator.getEndIndex();
            int i2 = endIndex - beginIndex;
            if (beginIndex < endIndex) {
                appendable.append(formatToCharacterIterator.first());
                while (true) {
                    beginIndex++;
                    if (beginIndex >= endIndex) {
                        break;
                    }
                    appendable.append(formatToCharacterIterator.next());
                }
            }
            this.b = i2 + i;
            formatToCharacterIterator.first();
            int index = formatToCharacterIterator.getIndex();
            beginIndex = formatToCharacterIterator.getEndIndex();
            i -= index;
            while (index < beginIndex) {
                Map attributes = formatToCharacterIterator.getAttributes();
                i2 = formatToCharacterIterator.getRunLimit();
                if (attributes.size() != 0) {
                    for (Entry entry : attributes.entrySet()) {
                        this.c.add(new bp((Attribute) entry.getKey(), entry.getValue(), i + index, i + i2));
                    }
                }
                formatToCharacterIterator.setIndex(i2);
                index = i2;
            }
        } catch (IOException e) {
            throw new cp(e);
        }
    }

    public final void a(Format format, Object obj, String str) {
        if (this.c == null && str != null) {
            a(str);
        } else {
            a(format, obj);
        }
    }
}
