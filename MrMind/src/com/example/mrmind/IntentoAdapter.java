package com.example.mrmind;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

public class IntentoAdapter extends BaseAdapter{

	private final Context context;
	private final List<Intento> intentos;
	
	public IntentoAdapter(Context context, List<Intento> intentos) {
		this.context = context;
		this.intentos = intentos;
	}
	
	public int getCount() {
		return intentos.size();
	}
	
	public Object getItem(int position) {
		return intentos.get(position);
	}
	
	public long getItemId(int position) {
		return position;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		Intento intento = this.intentos.get(position);
		return new IntentoListView(this.context, intento);
	}
	
	private final class IntentoListView extends LinearLayout {
		
		private Intento intento;
		
		public IntentoListView(Context context, Intento intento) {
			super(context);
			setOrientation(LinearLayout.VERTICAL);
			LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT); params.setMargins(5, 3, 5, 0);
			this.intento = intento;
			this.addView(this.intento, params);
		}
	
	}
}
