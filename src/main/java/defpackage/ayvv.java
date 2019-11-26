package defpackage;

/* renamed from: ayvv */
public enum ayvv implements anxv {
    USER_MENTION_AUTO_COMPLETE_SOURCE_UNKNOWN(0),
    USER_MENTION_AUTO_COMPLETE_SOURCE_BACKSTAGE_POST(1),
    USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_MENTION_STICKER(2),
    USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER(3);
    
    public final int c;

    public final int getNumber() {
        return this.c;
    }

    public static ayvv a(int i) {
        if (i == 0) {
            return USER_MENTION_AUTO_COMPLETE_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return USER_MENTION_AUTO_COMPLETE_SOURCE_BACKSTAGE_POST;
        }
        if (i != 2) {
            return i != 3 ? null : USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER;
        } else {
            return USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_MENTION_STICKER;
        }
    }

    public static anxx a() {
        return ayvy.a;
    }

    private ayvv(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
