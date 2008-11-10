/*
p2pproxy Copyright (C) 2007  Jehan Monnier ()

P2pProxySipProxyRegistrarManagement.java - .

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.linphone.p2pproxy.api;



public interface P2pProxyResourceManagement {
	public final String DOMAINE="p2p.linphone.org";
	/**
    * 
    * @return the SIP uris of an available sip proxy registrar for a given domaine 
    */
   public String[] lookupSipProxiesUri(String aDomaine) throws P2pProxyException ;
   
   public void revokeSipProxy(String aProxy) throws P2pProxyException;
   
   public void revokeMediaServer(String aMediaServer) throws P2pProxyException;
   /**
    * return 2 adresses where to contact media server (stun/rtprelay)
    */
   public String[] getMediaServerList() throws P2pProxyException;


   
}
