package defpackage;

import com.google.android.youtube.R;

/* renamed from: yod */
public enum yod {
    DELETE(R.drawable.quantum_ic_delete_grey600_24, R.string.chat_message_bottom_sheet_item_delete),
    COPY(R.drawable.quantum_ic_content_copy_grey600_24, R.string.chat_message_bottom_sheet_item_copy),
    SHARE(R.drawable.quantum_ic_googleplus_reshare_grey600_24, R.string.chat_message_bottom_sheet_item_share);
    
    public final int d;
    public final int e;

    private yod(int i, int i2) {
        this.d = i;
        this.e = i2;
    }
}
