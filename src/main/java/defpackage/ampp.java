package defpackage;

/* renamed from: ampp */
public abstract class ampp implements amqv {
    protected ampp() {
    }

    public abstract boolean a(char c);

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        amqw.b(i, length);
        while (i < length) {
            if (a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
