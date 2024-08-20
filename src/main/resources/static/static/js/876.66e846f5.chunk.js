"use strict";(self.webpackChunklistig_react_ui=self.webpackChunklistig_react_ui||[]).push([[876],{6879:(e,r,t)=>{t.d(r,{A:()=>n});var s=t(9217);class n{constructor(){this.baseUrl=s.C1}async sendPost(e,r,t){const s=await fetch(this.baseUrl+e,{method:"POST",headers:{"Content-Type":"application/json",Authorization:"Basic "+t},body:JSON.stringify(r)});if(!s.ok){console.log(await s.json());const e=await s.json();throw new Error(e)}return await s.json()}async sendPostNoLogin(e,r){const t=await fetch(this.baseUrl+e,{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify(r)});if(!t.ok){const e=await t.json();throw new Error(e)}return await t.json()}async sendGet(e,r){const t=await fetch(this.baseUrl+e,{method:"GET",headers:{"Content-Type":"application/json",Authorization:"Basic "+r}});if(!t.ok)throw new Error(await t.json());return await t.json()}async sendGetNoAuth(e){const r=await fetch(this.baseUrl+e,{method:"GET",headers:{"Content-Type":"application/json"}});if(!r.ok)throw new Error(await r.json());return await r.json()}async sendDelete(e,r,t){const s=await fetch(this.baseUrl+e,{method:"DELETE",headers:{"Content-Type":"application/json",Authorization:"Basic "+t},body:JSON.stringify(r)});if(!s.ok)throw new Error(await s.json());return await s.json()}}},9007:(e,r,t)=>{t.d(r,{A:()=>i});var s=t(5865),n=t(6446),a=(t(5043),t(579));const i=e=>{let{title:r}=e;return(0,a.jsx)(a.Fragment,{children:(0,a.jsxs)(n.A,{sx:{paddingTop:2,paddingRight:5,paddingLeft:5},children:[(0,a.jsx)(s.A,{fontSize:"xx-large",sx:{fontFamily:"Garamond",color:"primary.main"},children:(0,a.jsx)("strong",{children:r})}),(0,a.jsx)("br",{})]})})}},5876:(e,r,t)=>{t.r(r),t.d(r,{default:()=>S});var s=t(5043),n=t(6446),a=t(5721),i=t(1322),o=t(3851),l=t(8734),c=t(1045),d=t(8163),h=t(2177),x=t(2083),u=t(8983),p=t(1637),j=t(5865),y=t(4208),w=t(3766),A=t(6605),f=t(710),m=t(835),g=t(6879),b=t(9613),k=t(2680),C=t(9007),E=t(579);const v=new g.A;function S(){const{loginDetails:e,user:r}=(0,s.useContext)(b.c),[t,g]=(0,s.useState)([]),[S,T]=(0,s.useState)([]),[D,G]=(0,s.useState)(!0),[P,U]=(0,s.useState)([]),F=(0,m.Zp)(),[N,O]=s.useState("all"),z=e=>e.sort(((e,r)=>new Date(r.lastEdit)-new Date(e.lastEdit)));function B(e){return 1===e.users}function L(e){return 1!==e.users}return(0,s.useEffect)((()=>{(async()=>{try{const r=await v.sendGet("list/all",e),t=z(r);g(t),T(t)}catch(r){console.error("Error fetching data",r)}finally{G(!1)}})()}),[e]),(0,E.jsx)(E.Fragment,{children:(0,E.jsxs)(n.A,{maxWidth:750,sx:{mx:"auto"},children:[(0,E.jsx)(C.A,{title:"Lists"}),(0,E.jsx)(n.A,{sx:{paddingBottom:2},children:(0,E.jsxs)(x.A,{color:"primary",value:N,exclusive:!0,onChange:(e,r)=>{O(r),function(e){let r=[];switch(e){case"all":r=t;break;case"private":r=t.filter(B);break;case"shared":r=t.filter(L)}T(z(r))}(r)},"aria-label":"Filter",children:[(0,E.jsx)(u.A,{value:"private",children:"Private"}),(0,E.jsx)(u.A,{value:"all",children:"All"}),(0,E.jsx)(u.A,{value:"shared",children:"Shared"})]})}),D&&(0,E.jsx)(n.A,{sx:{display:"flex",justifyContent:"center",mt:4},children:(0,E.jsx)(p.A,{})}),!D&&0===S.length&&(0,E.jsx)(j.A,{variant:"h7",color:"textSecondary",align:"center",children:"Empty"}),!D&&S.length>0&&(0,E.jsx)(a.A,{dense:!0,children:S.map((e=>{return(0,E.jsxs)(i.Ay,{onClick:()=>{return r=e.id,void F("/web/list/".concat(r));var r},sx:{cursor:"pointer",border:"1px solid ",borderColor:"primary.darker",marginTop:"5px",borderRadius:"5px"},children:[(0,E.jsx)(o.A,{children:(0,E.jsx)(c.A,{sx:{backgroundColor:"primary.lighter"},children:(s=e.type,"CHECK"===s?(0,E.jsx)(k.A,{sx:{color:"primary.darker"}}):(0,E.jsx)(d.A,{sx:{color:"primary.darker"}}))})}),(0,E.jsx)(l.A,{primary:e.name,secondary:e.desc}),(t=e,t.owner!==r.username?(0,E.jsxs)(n.A,{sx:{color:"primary.lighter",display:"flex",flexDirection:"column",alignItems:"center"},children:[(0,E.jsx)(h.A,{}),(0,E.jsx)(j.A,{children:e.owner})]}):(0,E.jsx)(n.A,{children:(0,E.jsx)(y.A,{})}))]},e.id);var t,s}))}),!D&&0!==P.length&&(0,E.jsx)(E.Fragment,{children:(0,E.jsxs)(w.A,{sx:{cursor:"pointer",border:"1px solid ",borderColor:"primary.darker",marginTop:"5px",borderRadius:"5px"},children:[(0,E.jsx)(A.A,{children:"Public lists"}),(0,E.jsx)(f.A,{})]})})]})})}}}]);
//# sourceMappingURL=876.66e846f5.chunk.js.map