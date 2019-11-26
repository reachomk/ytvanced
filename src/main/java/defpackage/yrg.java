package defpackage;

import com.google.android.youtube.R;

/* renamed from: yrg */
public enum yrg {
    ACCEPT_INVITE(R.drawable.quantum_ic_check_grey600_24, R.string.contact_bottom_sheet_item_accept_invite),
    BLOCK(R.drawable.quantum_ic_block_grey600_24, R.string.contact_bottom_sheet_item_block, R.string.contact_bottom_sheet_item_block_confirm_title, R.string.contact_bottom_sheet_item_block_confirm_body, R.string.contact_bottom_sheet_item_block_confirm_confirm_button, R.string.contact_bottom_sheet_item_block_confirm_cancel_button),
    CANCEL_INVITE(R.drawable.quantum_ic_remove_circle_grey600_24, R.string.contact_bottom_sheet_item_cancel_invite),
    CHAT_WITH(R.drawable.quantum_ic_chat_grey600_24, R.string.contact_bottom_sheet_item_chat_with),
    GO_TO_CHANNEL(R.drawable.quantum_ic_account_circle_grey600_24, R.string.contact_bottom_sheet_item_go_to_channel),
    REMOVE_CONTACT(R.drawable.quantum_ic_remove_circle_grey600_24, R.string.contact_bottom_sheet_item_remove_contact, R.string.contact_bottom_sheet_item_remove_contact_confirm_title, R.string.contact_bottom_sheet_item_remove_contact_confirm_body, R.string.contact_bottom_sheet_item_remove_contact_confirm_confirm_button, R.string.contact_bottom_sheet_item_remove_contact_confirm_cancel_button),
    RESEND_INVITE(R.drawable.quantum_ic_refresh_grey600_24, R.string.contact_bottom_sheet_item_resend_invite),
    SEND_INVITE(R.drawable.quantum_ic_person_add_grey600_24, R.string.contact_bottom_sheet_item_send_invite),
    UNBLOCK(R.drawable.quantum_ic_add_grey600_24, R.string.contact_bottom_sheet_item_unblock);
    
    public final int j;
    public final int k;
    public final boolean l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;

    private yrg(int i, int i2) {
        this(r11, r12, i, i2, false, 0, 0, 0, 0);
    }

    private yrg(int i, int i2, int i3, int i4, int i5, int i6) {
        this(r11, r12, i, i2, true, i3, i4, i5, i6);
    }

    private yrg(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        this.j = i;
        this.k = i2;
        this.l = z;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = i6;
    }
}
