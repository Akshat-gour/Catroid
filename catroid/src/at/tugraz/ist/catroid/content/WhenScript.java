/**
 *  Catroid: An on-device graphical programming language for Android devices
 *  Copyright (C) 2010-2011 The Catroid Team
 *  (<http://code.google.com/p/catroid/wiki/Credits>)
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package at.tugraz.ist.catroid.content;

public class WhenScript extends Script {

	private static final long serialVersionUID = 1L;
	public static final String LONGPRESSED = "Long Pressed";
	public static final String TAPPED = "Tapped";
	public static final String DOUBLETAPPED = "Double Tapped";
	public static final String SWIPELEFT = "Swipe Left";
	public static final String SWIPERIGHT = "Swipe Right";
	public static final String SWIPEUP = "Swipe Up";
	public static final String SWIPEDOWN = "Swipe Down";
	private static final String[] actions = { TAPPED, DOUBLETAPPED, LONGPRESSED, SWIPEUP, SWIPEDOWN, SWIPELEFT,
			SWIPERIGHT };
	private String action;
	private int position;

	public WhenScript(String name, Sprite sprite) {
		super(name, sprite);
		super.isFinished = true;
		this.action = TAPPED;
	}

	@Override
	protected Object readResolve() {
		isFinished = true;
		super.readResolve();
		return this;
	}

	public void setAction(int position) {
		this.position = position;
		this.action = actions[position];
	}

	public String getAction() {
		return action;
	}

	public int getPosition() {
		return position;
	}
}
