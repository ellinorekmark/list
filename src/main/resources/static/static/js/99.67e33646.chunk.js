"use strict";(self.webpackChunklistig_react_ui=self.webpackChunklistig_react_ui||[]).push([[99],{6879:(e,t,n)=>{n.d(t,{A:()=>i});var r=n(9217);class i{constructor(){this.baseUrl=r.C1}async sendPost(e,t,n){const r=await fetch(this.baseUrl+e,{method:"POST",headers:{"Content-Type":"application/json",Authorization:"Basic "+n},body:JSON.stringify(t)});if(!r.ok){console.log(await r.json());const e=await r.json();throw new Error(e)}return await r.json()}async sendPostNoLogin(e,t){const n=await fetch(this.baseUrl+e,{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify(t)});if(!n.ok){const e=await n.json();throw new Error(e)}return await n.json()}async sendGet(e,t){const n=await fetch(this.baseUrl+e,{method:"GET",headers:{"Content-Type":"application/json",Authorization:"Basic "+t}});if(!n.ok)throw new Error(await n.json());return await n.json()}async sendGetNoAuth(e){const t=await fetch(this.baseUrl+e,{method:"GET",headers:{"Content-Type":"application/json"}});if(!t.ok)throw new Error(await t.json());return await t.json()}async sendDelete(e,t,n){const r=await fetch(this.baseUrl+e,{method:"DELETE",headers:{"Content-Type":"application/json",Authorization:"Basic "+n},body:JSON.stringify(t)});if(!r.ok)throw new Error(await r.json());return await r.json()}}},2475:(e,t,n)=>{n.d(t,{A:()=>u});n(5043);var r=n(5721),i=n(1322),s=n(3851),o=n(6446),a=n(8734),l=n(7392),c=n(4208),d=n(579);const u=e=>{let{uList:t}=e;return(0,d.jsx)(d.Fragment,{children:(0,d.jsx)(r.A,{children:t.items.map((e=>(0,d.jsxs)(i.Ay,{sx:{cursor:"pointer",border:"1px solid ",borderColor:"primary.darker",marginTop:"5px",borderRadius:"5px"},children:[(0,d.jsx)(s.A,{children:(0,d.jsx)(o.A,{})}),(0,d.jsx)(a.A,{primary:e.item,primaryTypographyProps:{fontSize:"18px"}}),(0,d.jsx)(l.A,{sx:{pointerEvents:"none"},edge:"end",children:(0,d.jsx)(c.A,{})})]},e.id)))})})}},8351:(e,t,n)=>{n.d(t,{A:()=>m});var r=n(5043),i=n(5721),s=n(1322),o=n(3851),a=n(6446),l=n(8734),c=n(7392),d=n(4208),u=n(6581),p=n(4109),x=n(9613),h=n(579);const m=e=>{let{uList:t,updateList:n,isPublic:m}=e;const{user:j}=(0,r.useContext)(x.c),[A,g]=(0,r.useState)((()=>!m&&(j.username===t.owner||t.editors.includes(j.username))));return(0,h.jsx)(h.Fragment,{children:(0,h.jsx)(i.A,{children:t.items.map((e=>{return(0,h.jsxs)(s.Ay,{sx:{cursor:"pointer",border:"1px solid ",borderColor:"primary.darker",marginTop:"5px",borderRadius:"5px"},onClick:()=>(e=>{if(A){const r=t.items.map((t=>t.id===e?{...t,itemStatus:"1"===t.itemStatus?"":"1"}:t));n({...t,items:r})}})(e.id),children:[(0,h.jsx)(o.A,{children:(0,h.jsx)(a.A,{children:(r=e.itemStatus,"1"===r?(0,h.jsx)(u.A,{sx:{color:"secondary.main"}}):(0,h.jsx)(p.A,{sx:{color:"secondary.main"}}))})}),(0,h.jsx)(l.A,{primary:e.item,primaryTypographyProps:{fontSize:"18px"}}),(0,h.jsx)(c.A,{sx:{pointerEvents:"none"},edge:"end",children:(0,h.jsx)(d.A,{})})]},e.id);var r}))})})}},5828:(e,t,n)=>{n.d(t,{A:()=>f});var r=n(5043),i=n(5721),s=n(1322),o=n(3851),a=n(8734),l=n(7392),c=n(35),d=n(6600),u=n(1906),p=n(5316),x=n(5146),h=n(9347),m=n(6485),j=n(2577),A=n(9613),g=n(579);const f=e=>{let{uList:t,updateList:n,isPublic:f}=e;const{user:y}=(0,r.useContext)(A.c),[b,v]=(0,r.useState)((()=>!f&&(y.username===t.owner||t.editors.includes(y.username)))),[C,k]=(0,r.useState)(!1),[w,S]=(0,r.useState)(""),[L,z]=(0,r.useState)(""),[T,R]=(0,r.useState)(!1);function F(e){""!==e&&window.open(e,"_blank","noopener,noreferrer")}return(0,g.jsxs)(g.Fragment,{children:[(0,g.jsx)(i.A,{children:t.items.map((e=>(0,g.jsxs)(s.Ay,{sx:{cursor:"pointer",border:"1px solid ",borderColor:"primary.darker",marginTop:"5px",borderRadius:"5px"},children:[(0,g.jsx)(o.A,{onClick:()=>F(e.itemStatus),children:""!==e.itemStatus&&(0,g.jsx)(m.A,{})}),(0,g.jsx)(a.A,{primary:e.item,primaryTypographyProps:{fontSize:"18px"},onClick:()=>F(e.itemStatus)}),(0,g.jsx)(l.A,{edge:"end",onClick:()=>function(e){S(e),z(e.itemStatus),k(!0)}(e),children:(0,g.jsx)(j.A,{})})]},e.id)))}),(0,g.jsxs)(c.A,{open:C,onClose:()=>{k(!1)},children:[(0,g.jsx)(d.A,{textAlign:"center",children:"Edit link"}),(0,g.jsx)("br",{}),""!==L&&(0,g.jsx)(u.A,{variant:"outlined",fullWidth:!0,onClick:async()=>{try{await navigator.clipboard.writeText(L),R(!0),setTimeout((()=>R(!1)),2e3)}catch(e){console.error("Failed to copy text: ",e)}},children:T?"Link Copied!":"Copy Link"}),(0,g.jsx)(p.A,{children:b?(0,g.jsx)(x.A,{label:"Edit Link",value:L,onChange:e=>z(e.target.value)}):(0,g.jsx)(x.A,{label:"Link",value:L})}),(0,g.jsxs)(h.A,{sx:{justifyContent:"center"},children:[(0,g.jsx)(u.A,{onClick:()=>{k(!1)},variant:"contained",children:"Close"}),b&&(0,g.jsx)(u.A,{onClick:()=>{!function(){const e=t.items.map((e=>e.id===w.id?{...e,itemStatus:L}:e));n({...t,items:e}),k(!1)}()},variant:"contained",children:"Save"})]})]})]})}},5704:(e,t,n)=>{n.d(t,{A:()=>o});n(5043);var r=n(6446),i=n(5865),s=n(579);const o=e=>{let{uList:t}=e;return(0,s.jsx)(s.Fragment,{children:(()=>{if(null!==t.listInfo.listDesc)return(0,s.jsx)(s.Fragment,{children:(0,s.jsx)(r.A,{sx:{marginBottom:1,gridRow:"1",gridColumn:"1 / 2",m:1,paddingLeft:2,paddingRight:2},children:(0,s.jsxs)(i.A,{fontSize:"large",children:[t.listInfo.listDesc,(0,s.jsx)("br",{})]})})})})()})}},524:(e,t,n)=>{n.d(t,{A:()=>C});var r=n(5043),i=n(7392),s=n(5721),o=n(1322),a=n(3851),l=n(8734),c=n(35),d=n(6600),u=n(5316),p=n(5146),x=n(9347),h=n(1906),m=n(6485),j=n(9613),A=n(6581),g=n(3968),f=n(4536),y=n(4109),b=n(852),v=n(579);const C=e=>{let{uList:t,updateList:n,isPublic:C}=e;const{user:k}=(0,r.useContext)(j.c),[w,S]=(0,r.useState)((()=>!C&&(k.username===t.owner||t.editors.includes(k.username)))),[L,z]=(0,r.useState)({}),T=e=>{z((t=>({...t,[e]:!t[e]})))},[R,F]=(0,r.useState)(!1),[E,I]=(0,r.useState)(""),[P,N]=(0,r.useState)("");function $(){return t.listInfo.hasLink}function B(e){if(t.listInfo.hasLink)return null!==e&&""!==e}function O(){return t.listInfo.hasComment}function U(e){if(null!==e.comment&&""!==e.comment)return!0}function D(e){return w?(0,v.jsx)(i.A,{onClick:()=>function(e){I(e),N(e.comment||""),F(!0)}(e),children:(0,v.jsx)(b.A,{})}):(0,v.jsx)(v.Fragment,{})}function G(e){return!0===t.listInfo.hasCheck&&e.checked}function M(e){return e.checked?(0,v.jsx)(A.A,{sx:{color:"primary.main"}}):(0,v.jsx)(y.A,{sx:{color:"primary.main"}})}return(0,v.jsxs)(v.Fragment,{children:[(0,v.jsx)(s.A,{children:t.items.map((e=>(0,v.jsxs)("div",{children:[(0,v.jsxs)(o.Ay,{sx:{cursor:"pointer",border:"1px solid ",borderColor:"primary.darker",marginTop:"5px",borderRadius:"5px",opacity:G(e)&&.5,textDecoration:(()=>{const t=G(e),n=B(e.link);return t&&n?"line-through underline":t?"line-through":n?"underline":"none"})()},children:[(0,v.jsx)(a.A,{children:O()?(0,v.jsx)(v.Fragment,{children:U(e)?(0,v.jsx)(v.Fragment,{children:(0,v.jsx)(i.A,{onClick:()=>T(e.id),children:L[e.id]?(0,v.jsx)(f.A,{}):(0,v.jsx)(g.A,{})})}):(0,v.jsx)(v.Fragment,{children:D(e)})}):(0,v.jsx)(v.Fragment,{children:$()&&(0,v.jsx)(v.Fragment,{children:B(e.link)&&(0,v.jsx)(m.A,{})})})}),$&&(0,v.jsx)(v.Fragment,{children:O()&&(0,v.jsx)(v.Fragment,{children:B(e.link)&&(0,v.jsx)(m.A,{sx:{paddingRight:"5px"}})})}),(0,v.jsx)(l.A,{primary:e.item,primaryTypographyProps:{fontSize:"18px"},onClick:()=>{var t;B(t=e.link)&&window.open(t,"_blank","noopener,noreferrer")}}),t.listInfo.hasCheck&&(0,v.jsx)(i.A,{edge:"end",onClick:()=>(e=>{if(w){const r=t.items.map((t=>t.id===e?{...t,checked:!t.checked}:t));n({...t,items:r})}})(e.id),children:M(e)})]}),L[e.id]&&(0,v.jsxs)(o.Ay,{sx:{marginTop:"5px",padding:"10px",borderRadius:"5px"},children:[(0,v.jsx)(a.A,{children:D(e)}),(0,v.jsx)(l.A,{secondary:e.comment,secondaryTypographyProps:{fontSize:"14px",color:"text.secondary",align:"left",marginLeft:"10px"}})]})]},e.id)))}),(0,v.jsxs)(c.A,{sx:{"& .MuiDialog-paper":{width:"600px",maxWidth:"80%"}},open:R,onClose:()=>{F(!1)},children:[(0,v.jsx)(d.A,{textAlign:"center",children:"Edit Notes"}),(0,v.jsx)(u.A,{children:(0,v.jsx)(p.A,{inputProps:{maxLength:1e3},id:"outlined-multiline-flexible",label:"Notes",multiline:!0,rows:4,autoComplete:"off",variant:"outlined",value:P,onChange:e=>N(e.target.value),fullWidth:!0})}),(0,v.jsxs)(x.A,{sx:{justifyContent:"center"},children:[(0,v.jsx)(h.A,{onClick:()=>{F(!1)},variant:"contained",children:"Close"}),w&&(0,v.jsx)(h.A,{onClick:()=>{!function(){""===P&&T(E.id);const e=t.items.map((e=>e.id===E.id?{...e,comment:P}:e));n({...t,items:e}),F(!1)}()},variant:"contained",children:"Save"})]})]})]})}},9007:(e,t,n)=>{n.d(t,{A:()=>o});var r=n(5865),i=n(6446),s=(n(5043),n(579));const o=e=>{let{title:t}=e;return(0,s.jsx)(s.Fragment,{children:(0,s.jsxs)(i.A,{sx:{paddingTop:2,paddingRight:5,paddingLeft:5},children:[(0,s.jsx)(r.A,{fontSize:"xx-large",sx:{fontFamily:"Garamond",color:"primary.main"},children:(0,s.jsx)("strong",{children:t})}),(0,s.jsx)("br",{})]})})}},7099:(e,t,n)=>{n.r(t),n.d(t,{default:()=>A});var r=n(5043),i=n(835),s=n(6446),o=n(1637),a=n(5865),l=n(6879),c=n(9007),d=n(5704),u=n(8351),p=n(2475),x=n(5828),h=n(524),m=n(579);const j=new l.A,A=()=>{const{uuid:e}=(0,i.g)(),[t,n]=(0,r.useState)(!0),[l,A]=(0,r.useState)(null),[g,f]=(0,r.useState)(!1);return(0,r.useEffect)((()=>{(async()=>{try{const t=await j.sendGetNoAuth(`public/${e}`);A(t)}catch(t){f(!0)}finally{n(!1)}})()}),[e]),(0,m.jsx)(m.Fragment,{children:(0,m.jsx)(s.A,{maxWidth:750,sx:{mx:"auto"},variant:"contained",children:t?(0,m.jsxs)(s.A,{children:[(0,m.jsx)(o.A,{}),(0,m.jsx)(a.A,{children:"Loading List"})]}):(0,m.jsx)(m.Fragment,{children:g?(0,m.jsx)(a.A,{children:"Unable to load list."}):(0,m.jsxs)(m.Fragment,{children:[(0,m.jsx)(c.A,{title:l.listInfo.listName}),(0,m.jsx)(d.A,{uList:l}),(0,m.jsx)(s.A,{children:function(e){switch(e.listInfo.type){case"CHECK":return(0,m.jsx)(u.A,{uList:l,updateList:void 0,isPublic:!0});case"LINK":return(0,m.jsx)(x.A,{uList:l,updateList:void 0,isPublic:!0});case"BASIC":return(0,m.jsx)(p.A,{uList:l});default:return(0,m.jsx)(h.A,{uList:l,updateList:void 0,isPublic:!0})}}(l)})]})})})})}},7392:(e,t,n)=>{n.d(t,{A:()=>y});var r=n(8587),i=n(8168),s=n(5043),o=n(8387),a=n(8606),l=n(7266),c=n(4535),d=n(8206),u=n(6236),p=n(6803),x=n(7056),h=n(2400);function m(e){return(0,h.Ay)("MuiIconButton",e)}const j=(0,x.A)("MuiIconButton",["root","disabled","colorInherit","colorPrimary","colorSecondary","colorError","colorInfo","colorSuccess","colorWarning","edgeStart","edgeEnd","sizeSmall","sizeMedium","sizeLarge"]);var A=n(579);const g=["edge","children","className","color","disabled","disableFocusRipple","size"],f=(0,c.Ay)(u.A,{name:"MuiIconButton",slot:"Root",overridesResolver:(e,t)=>{const{ownerState:n}=e;return[t.root,"default"!==n.color&&t[`color${(0,p.A)(n.color)}`],n.edge&&t[`edge${(0,p.A)(n.edge)}`],t[`size${(0,p.A)(n.size)}`]]}})((e=>{let{theme:t,ownerState:n}=e;return(0,i.A)({textAlign:"center",flex:"0 0 auto",fontSize:t.typography.pxToRem(24),padding:8,borderRadius:"50%",overflow:"visible",color:(t.vars||t).palette.action.active,transition:t.transitions.create("background-color",{duration:t.transitions.duration.shortest})},!n.disableRipple&&{"&:hover":{backgroundColor:t.vars?`rgba(${t.vars.palette.action.activeChannel} / ${t.vars.palette.action.hoverOpacity})`:(0,l.X4)(t.palette.action.active,t.palette.action.hoverOpacity),"@media (hover: none)":{backgroundColor:"transparent"}}},"start"===n.edge&&{marginLeft:"small"===n.size?-3:-12},"end"===n.edge&&{marginRight:"small"===n.size?-3:-12})}),(e=>{let{theme:t,ownerState:n}=e;var r;const s=null==(r=(t.vars||t).palette)?void 0:r[n.color];return(0,i.A)({},"inherit"===n.color&&{color:"inherit"},"inherit"!==n.color&&"default"!==n.color&&(0,i.A)({color:null==s?void 0:s.main},!n.disableRipple&&{"&:hover":(0,i.A)({},s&&{backgroundColor:t.vars?`rgba(${s.mainChannel} / ${t.vars.palette.action.hoverOpacity})`:(0,l.X4)(s.main,t.palette.action.hoverOpacity)},{"@media (hover: none)":{backgroundColor:"transparent"}})}),"small"===n.size&&{padding:5,fontSize:t.typography.pxToRem(18)},"large"===n.size&&{padding:12,fontSize:t.typography.pxToRem(28)},{[`&.${j.disabled}`]:{backgroundColor:"transparent",color:(t.vars||t).palette.action.disabled}})})),y=s.forwardRef((function(e,t){const n=(0,d.b)({props:e,name:"MuiIconButton"}),{edge:s=!1,children:l,className:c,color:u="default",disabled:x=!1,disableFocusRipple:h=!1,size:j="medium"}=n,y=(0,r.A)(n,g),b=(0,i.A)({},n,{edge:s,color:u,disabled:x,disableFocusRipple:h,size:j}),v=(e=>{const{classes:t,disabled:n,color:r,edge:i,size:s}=e,o={root:["root",n&&"disabled","default"!==r&&`color${(0,p.A)(r)}`,i&&`edge${(0,p.A)(i)}`,`size${(0,p.A)(s)}`]};return(0,a.A)(o,m,t)})(b);return(0,A.jsx)(f,(0,i.A)({className:(0,o.A)(v.root,c),centerRipple:!0,focusRipple:!h,disabled:x,ref:t},y,{ownerState:b,children:l}))}))}}]);
//# sourceMappingURL=99.67e33646.chunk.js.map